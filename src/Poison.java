import java.util.Random;

public class Poison extends Cell {
    private Random random;
    private Snake snake;
    //private Poison poison;
    private Food food;

    public Poison(Snake snake) {
        super(-1, -1, GameSnake.CELL_SIZE, GameSnake.POISON_COLOR);
        random = new Random();
        this.snake = snake;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public boolean isPoison(int x, int y) {
        if ((getX() == x) && (getY() == y)) {
            return true;
        }

        return false;
    }

    public void add() {
        int x, y;
        do {
            x = random.nextInt(GameSnake.CANVAS_WIDTH);
            y = random.nextInt(GameSnake.CANVAS_HEIGHT);
        } while (snake.isInSnake(x, y) || food.isFood(x, y));
        set(x, y);
    }
}
