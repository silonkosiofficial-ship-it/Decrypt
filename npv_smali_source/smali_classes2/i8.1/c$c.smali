.class public final enum Li8/c$c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lp8/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field public static final enum D:Li8/c$c;

.field public static final enum E:Li8/c$c;

.field public static final enum F:Li8/c$c;

.field public static final enum G:Li8/c$c;

.field public static final enum H:Li8/c$c;

.field public static final enum I:Li8/c$c;

.field public static final enum J:Li8/c$c;

.field private static K:Lp8/j$b;

.field private static final synthetic L:[Li8/c$c;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Li8/c$c;

    const-string v1, "CLASS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Li8/c$c;-><init>(Ljava/lang/String;III)V

    sput-object v0, Li8/c$c;->D:Li8/c$c;

    new-instance v1, Li8/c$c;

    const-string v3, "INTERFACE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4, v4}, Li8/c$c;-><init>(Ljava/lang/String;III)V

    sput-object v1, Li8/c$c;->E:Li8/c$c;

    new-instance v3, Li8/c$c;

    const-string v5, "ENUM_CLASS"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6, v6}, Li8/c$c;-><init>(Ljava/lang/String;III)V

    sput-object v3, Li8/c$c;->F:Li8/c$c;

    new-instance v5, Li8/c$c;

    const-string v7, "ENUM_ENTRY"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8, v8}, Li8/c$c;-><init>(Ljava/lang/String;III)V

    sput-object v5, Li8/c$c;->G:Li8/c$c;

    new-instance v7, Li8/c$c;

    const-string v9, "ANNOTATION_CLASS"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10, v10}, Li8/c$c;-><init>(Ljava/lang/String;III)V

    sput-object v7, Li8/c$c;->H:Li8/c$c;

    new-instance v9, Li8/c$c;

    const-string v11, "OBJECT"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12, v12}, Li8/c$c;-><init>(Ljava/lang/String;III)V

    sput-object v9, Li8/c$c;->I:Li8/c$c;

    new-instance v11, Li8/c$c;

    const-string v13, "COMPANION_OBJECT"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v14, v14}, Li8/c$c;-><init>(Ljava/lang/String;III)V

    sput-object v11, Li8/c$c;->J:Li8/c$c;

    const/4 v13, 0x7

    new-array v13, v13, [Li8/c$c;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, Li8/c$c;->L:[Li8/c$c;

    new-instance v0, Li8/c$c$a;

    invoke-direct {v0}, Li8/c$c$a;-><init>()V

    sput-object v0, Li8/c$c;->K:Lp8/j$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p4, p0, Li8/c$c;->C:I

    return-void
.end method

.method public static e(I)Li8/c$c;
    .locals 0

    .prologue
    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, Li8/c$c;->J:Li8/c$c;

    return-object p0

    :pswitch_1
    sget-object p0, Li8/c$c;->I:Li8/c$c;

    return-object p0

    :pswitch_2
    sget-object p0, Li8/c$c;->H:Li8/c$c;

    return-object p0

    :pswitch_3
    sget-object p0, Li8/c$c;->G:Li8/c$c;

    return-object p0

    :pswitch_4
    sget-object p0, Li8/c$c;->F:Li8/c$c;

    return-object p0

    :pswitch_5
    sget-object p0, Li8/c$c;->E:Li8/c$c;

    return-object p0

    :pswitch_6
    sget-object p0, Li8/c$c;->D:Li8/c$c;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Li8/c$c;
    .locals 1

    const-class v0, Li8/c$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li8/c$c;

    return-object p0
.end method

.method public static values()[Li8/c$c;
    .locals 1

    sget-object v0, Li8/c$c;->L:[Li8/c$c;

    invoke-virtual {v0}, [Li8/c$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li8/c$c;

    return-object v0
.end method


# virtual methods
.method public final c()I
    .locals 1

    iget v0, p0, Li8/c$c;->C:I

    return v0
.end method
