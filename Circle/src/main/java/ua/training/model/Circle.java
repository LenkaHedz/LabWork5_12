package ua.training.model;

/** Класс служит для хранения круга со свойствами
 * <b>radius</b>
 * @autor Hedz Olena
 * @version 1.0
 */
public class Circle extends Shape implements Cloneable {
    private double radius;

    /** Создает новый круг
     * @see Circle#Circle(double)
     */
    public Circle() {
        super();
    }

    /** Создает новый круг с радиусом
     * @param radius - радиус
     * @see Circle#Circle()
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /** Функция для получения радиуса {@link Circle#radius}
     * @return Возвращает радиус
     */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean checkRadius(double radius){
        if(radius > 0){
            this.setRadius(radius);
            return true;
        }
        return false;
    }

    /** Функция для получения периметра
     * @return Возвращает периметр
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    /** Функция для получения площади
     * @return Возвращает площадь
     */
    @Override
    public double getArea() {
        double s = Math.PI * Math.pow(this.radius, 2);
        if (s >= 0) {
            return s;
        } else {
            return 0;
        }
    }

    /** Функция для получения названия класса
     * @return Возвращает название класса
     */
    @Override
    public String getShapeClass() {
        return this.getClass().getSimpleName();
    }


    /** Функция для получения клон круга
     * @return Возвращает клон круга
     */
    @Override
    public Circle clone() {
        try{
            Circle resutl = (Circle)super.clone();
            return resutl;
        }catch ( CloneNotSupportedException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;}
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;}
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return this.getShapeClass() + "[radius=" + this.radius + " perimeter="+ this.getPerimeter() + " area=" + this.getArea() +"]";
    }

}
