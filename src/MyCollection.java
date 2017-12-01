import java.util.ArrayList;

public class MyCollection extends ArrayList<Integer>{
    @Override
    public Integer set(int i, Integer integer) {
        return super.set(i, integer);
    }

    @Override
    public boolean add(Integer integer) {
        if(super.add(integer)){
            for(int i = 0; i < super.size()- 1; i++){
                super.set(i, super.get(i) + integer);
            }
            return true;
        }
        return false;
    }

    @Override
    public void add(int i, Integer integer) {
        super.add(i, integer);
        for(int j = 0; j < super.size(); j++){
            if(j == i) continue;
            super.set(j, super.get(j) + integer);
        }
    }

    @Override
    public Integer remove(int i) {
        int removeInt = super.get(i);
        for(int j = 0; j < super.size(); j++){
            if(j == i) continue;
            super.set(j, super.get(j) - removeInt);
        }
        return super.remove(i);
    }

    @Override
    public boolean remove(Object o) {
        int removeInt = 0;
        int removeIntIndex = 0;
        if(o != null && super.contains(o)){
            for(int i = 0; i < super.size(); i++){
                if(super.get(i).equals(o)){
                    removeInt = super.get(i);
                    removeIntIndex = i;
                    break;
                }
            }
            for(int i = 0; i < super.size(); i++){
                if(i == removeIntIndex) continue;
                super.set(i, super.get(i) - removeInt);
            }

        }
        return super.remove(o);
    }
}
