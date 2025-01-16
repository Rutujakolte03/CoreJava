public class Cuboid {
    int width;
    int height;
    int depth;
    Cuboid(int width, int height, int depth) {
       this.width = width;
       this.height = height;
       this.depth = depth;
    }
    Cuboid(int width, int height) {
        this.width = width;
        this.height = height;
    }
    Cuboid(int dimension) {
        width = dimension;
        height = dimension;
        depth = dimension;
    }
    int volume() {
        return width * height * depth;
    }
    public static void main(String[] args) {
       int volume;
       Cuboid stdCuboid = new Cuboid(10, 20, 15);
       volume = stdCuboid.volume();
       System.out.println("volume of a simple cuboid: " + volume);
       Cuboid cuboidwithDefaults = new Cuboid(10, 20, 30);
       volume = stdCuboid.volume();
       System.out.println("Volume of cuboid with default:" + volume);
       Cuboid cube = new Cuboid(10);
       volume = cube.volume();
       System.out.println("Volume of cube is: " + volume);
     /*   Cuboid defaultCuboid = new Cuboid();
       volume = defaultCuboid.volume();
       System.out.println("volume of defaultCuboid: " + volume);
       */
    }
}