package guide;

import java.util.HashMap;
import java.util.Objects;

public class Guide {
    private String fullName;
    private String numberPhone;

    private HashMap<String, String> phone;

    public Guide(String fullName, String numberPhone) {
        if (fullName != null && !fullName.isEmpty() && !fullName.isBlank()) {
            this.fullName = fullName;
        }
        if (numberPhone != null && !numberPhone.isBlank() && !numberPhone.isEmpty()) {
            this.numberPhone = numberPhone;
        }
        this.phone = new HashMap<>();
        this.phone.put(getFullName(), getNumberPhone());
    }

    public String getFullName() {
        return fullName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public HashMap<String, String> getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guide guide = (Guide) o;
        return Objects.equals(fullName, guide.fullName) && Objects.equals(numberPhone, guide.numberPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, numberPhone);
    }

    @Override
    public String toString() {
        return fullName + " " + numberPhone + " " + phone;
    }
}
