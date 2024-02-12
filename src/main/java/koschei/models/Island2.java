package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Island2 {

    private Wood3 wood3;

    @Autowired
    public Island2(Wood3 wood) {
        this.wood3 = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood3.toString();
    }
}
