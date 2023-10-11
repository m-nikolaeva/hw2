import org.junit.jupiter.api.Test;
import ru.gb.Component;
import ru.gb.Container;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValuationOfContainerTest {

    @Test
    void oneComponentTest(){
        //given
        Component component = new Component(50L);
        //then
        assertEquals(50L, component.getValuation());
    }

    @Test
    void oneContainerTest(){
        //given
        Container crisper = new Container();
        crisper.addContainer(new Component( 350L));
        crisper.addContainer(new Component( 150L));
        crisper.addContainer(new Component( 200L));
        //when
        Long valuation = crisper.getValuation();
        //then
        assertEquals(700L, valuation);
    }

    @Test
    void overallContainerTest(){
        //given
        Container crisper = new Container();
        Container box1 = new Container();
        Container box2 = new Container();
        Component component1 = new Component(100L);
        Component component2 = new Component(300L);
        Component component3 = new Component(500L);
        box1.addContainer(component2);
        box1.addContainer(component3);
        box2.addContainer(component1);
        box2.addContainer(component3);
        crisper.addContainer(box1);
        crisper.addContainer(box2);
        //when
        Long valuation = crisper.getValuation();
        //then
        assertEquals(1400L, valuation);
    }

    @Test
    void withoutOneComponentInOverallContainerTest(){
        //given
        Container crisper = new Container();
        Container box1 = new Container();
        Container box2 = new Container();
        Component component1 = new Component(300L);
        Component component2 = new Component(400L);
        Component component3 = new Component(600L);
        box1.addContainer(component2);
        box1.addContainer(component3);
        box2.addContainer(component1);
        box2.addContainer(component3);
        crisper.addContainer(box1);
        crisper.addContainer(box2);
        box2.deleteContainer(component1);
        //when
        Long valuation = crisper.getValuation();
        //then
        assertEquals(1600L, valuation);
    }
}




