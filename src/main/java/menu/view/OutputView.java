package menu.view;

public class OutputView {
    private static final String WELCOME_MESSAGE = "점심 메뉴 추천을 시작합니다.";
    private static final String RECOMMEND_RESULT_MESSAGE = "메뉴 추천 결과입니다.";
    private static final String RECOMMEND_COMPLETE_MESSAGE = "추천을 완료했습니다.";

    public static void welcomeMessage(){
        System.out.println(WELCOME_MESSAGE);
    }
}
