.class public final enum LP1/h$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum D:LP1/h$b;

.field public static final enum E:LP1/h$b;

.field public static final enum F:LP1/h$b;

.field public static final enum G:LP1/h$b;

.field public static final enum H:LP1/h$b;

.field public static final enum I:LP1/h$b;

.field public static final enum J:LP1/h$b;

.field public static final enum K:LP1/h$b;

.field public static final enum L:LP1/h$b;

.field private static final synthetic M:[LP1/h$b;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LP1/h$b;

    const-string v1, "BOOLEAN"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, LP1/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LP1/h$b;->D:LP1/h$b;

    new-instance v0, LP1/h$b;

    const-string v1, "FLOAT"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v3, v4}, LP1/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LP1/h$b;->E:LP1/h$b;

    new-instance v0, LP1/h$b;

    const-string v1, "INTEGER"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v4, v3}, LP1/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LP1/h$b;->F:LP1/h$b;

    new-instance v0, LP1/h$b;

    const-string v1, "LONG"

    const/4 v4, 0x4

    invoke-direct {v0, v1, v3, v4}, LP1/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LP1/h$b;->G:LP1/h$b;

    new-instance v0, LP1/h$b;

    const-string v1, "STRING"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v4, v3}, LP1/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LP1/h$b;->H:LP1/h$b;

    new-instance v0, LP1/h$b;

    const-string v1, "STRING_SET"

    const/4 v4, 0x6

    invoke-direct {v0, v1, v3, v4}, LP1/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LP1/h$b;->I:LP1/h$b;

    new-instance v0, LP1/h$b;

    const-string v1, "DOUBLE"

    const/4 v3, 0x7

    invoke-direct {v0, v1, v4, v3}, LP1/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LP1/h$b;->J:LP1/h$b;

    new-instance v0, LP1/h$b;

    const-string v1, "BYTES"

    const/16 v4, 0x8

    invoke-direct {v0, v1, v3, v4}, LP1/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LP1/h$b;->K:LP1/h$b;

    new-instance v0, LP1/h$b;

    const-string v1, "VALUE_NOT_SET"

    invoke-direct {v0, v1, v4, v2}, LP1/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LP1/h$b;->L:LP1/h$b;

    invoke-static {}, LP1/h$b;->e()[LP1/h$b;

    move-result-object v0

    sput-object v0, LP1/h$b;->M:[LP1/h$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LP1/h$b;->C:I

    return-void
.end method

.method private static synthetic e()[LP1/h$b;
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [LP1/h$b;

    sget-object v1, LP1/h$b;->D:LP1/h$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LP1/h$b;->E:LP1/h$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LP1/h$b;->F:LP1/h$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LP1/h$b;->G:LP1/h$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LP1/h$b;->H:LP1/h$b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, LP1/h$b;->I:LP1/h$b;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, LP1/h$b;->J:LP1/h$b;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, LP1/h$b;->K:LP1/h$b;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, LP1/h$b;->L:LP1/h$b;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static g(I)LP1/h$b;
    .locals 0

    .prologue
    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, LP1/h$b;->K:LP1/h$b;

    return-object p0

    :pswitch_1
    sget-object p0, LP1/h$b;->J:LP1/h$b;

    return-object p0

    :pswitch_2
    sget-object p0, LP1/h$b;->I:LP1/h$b;

    return-object p0

    :pswitch_3
    sget-object p0, LP1/h$b;->H:LP1/h$b;

    return-object p0

    :pswitch_4
    sget-object p0, LP1/h$b;->G:LP1/h$b;

    return-object p0

    :pswitch_5
    sget-object p0, LP1/h$b;->F:LP1/h$b;

    return-object p0

    :pswitch_6
    sget-object p0, LP1/h$b;->E:LP1/h$b;

    return-object p0

    :pswitch_7
    sget-object p0, LP1/h$b;->D:LP1/h$b;

    return-object p0

    :pswitch_8
    sget-object p0, LP1/h$b;->L:LP1/h$b;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)LP1/h$b;
    .locals 1

    const-class v0, LP1/h$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LP1/h$b;

    return-object p0
.end method

.method public static values()[LP1/h$b;
    .locals 1

    sget-object v0, LP1/h$b;->M:[LP1/h$b;

    invoke-virtual {v0}, [LP1/h$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LP1/h$b;

    return-object v0
.end method
