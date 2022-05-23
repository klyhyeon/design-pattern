package com.baekho.design.pattern.solid.lsp;

public class RectangleController {

    public void increaseHeight(Rectangle rec) throws CantSupportSquareException {
        if (rec instanceof Square) {
            throw new CantSupportSquareException();
        }

        if (rec.getHeight() <= rec.getWidth()) {
            rec.setHeight(rec.getWidth() + 10);
        }
    }
}
