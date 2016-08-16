/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gagan.chess;

import com.gagan.chess.problem.ChessBoard;
import com.gagan.chess.problem.Piece;
import com.gagan.chess.problem.Util;
import com.gagan.chess.problem.factories.PieceFactory;
import com.gagan.chess.problem.types.Position;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Main class from where the execution starts
 *
 * @author gagssing
 */
public class FindValidMoves {

    public static void main(String... args) {
        final String newLine = System.getProperty("line.separator");
        System.out.println("> " + FindValidMoves.class.getSimpleName() + newLine);
        final Scanner input = new Scanner(System.in); // Cannot use Console api for testing in IDE, hence using System.in which works at both places

        String cont = "N";
        do {
            System.out.print("Enter number of pieces: ");
            final int piecesNo = input.nextInt();
            System.out.println(newLine);// to put extra line space

            ChessBoard board = new ChessBoard(); // New chessboard for each set of pieces.
            List<Piece> pieces = new ArrayList<>();// For iterating later, keep the record here too.
            int i = 1;
            while (i <= piecesNo) {
                System.out.println("Piece " + i);
                System.out.print("Enter colour (W/B): ");
                String color = input.next().toUpperCase(); // Lets keep everything in upper to avoid equals ignorecase later
                System.out.print("Enter type (B/N/P): ");
                String type = input.next().toUpperCase();
                System.out.print("Enter position: ");
                String position = input.next();
                Position pos = new Position(position);

                System.out.println(newLine);

                // Input Validations
                if ("P".equals(type) && (pos.getRowIndex() == 0 || pos.getRowIndex() == 7)) {
                    System.out.println("Pawns may not be placed on the first or last ranks.  Please re-enter." + newLine);
                    continue;
                }
                if (!pos.isValid()) {
                    System.out.println("Invalid position, Please reenter the values for this Piece" + newLine);
                    continue;
                }
                if (color.length() != 1 || (!"WB".contains(color))) { // color should only be among WB
                    System.out.println("Invalid Color value, Please reenter the values for this Piece" + newLine);
                    continue;
                }
                if (type.length() != 1 || (!"BNP".contains(type))) {
                    System.out.println("Invalid Type value, Please reenter the values for this Piece" + newLine);
                    continue;
                }
                Piece piece = PieceFactory.getPiece(color, type, position);
                board.add(piece);// To place on Chessboard
                pieces.add(piece);// To keep a record of all pieces found, to iterate later.
                i++;
            }

            System.out.println("Valid Moves: ");
            for (Piece piece : pieces) {// Iterate and find possible moves for each piece we have
                Set<Position> positions = piece.getPossiblePositions(board);
                System.out.println(piece + ": " + Util.getPrintableSet(positions));
            }
            System.out.println(newLine);
            System.out.print("Continue (Y/N)?: ");
            cont = input.next();
            System.out.println(newLine);
        } while ("Y".equalsIgnoreCase(cont)); // Being little flexible with case sensitivity

    }

}
