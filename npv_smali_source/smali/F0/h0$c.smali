.class final enum LF0/h0$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation


# static fields
.field public static final enum C:LF0/h0$c;

.field public static final enum D:LF0/h0$c;

.field private static final synthetic E:[LF0/h0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LF0/h0$c;

    const-string v1, "Min"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LF0/h0$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF0/h0$c;->C:LF0/h0$c;

    new-instance v0, LF0/h0$c;

    const-string v1, "Max"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF0/h0$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LF0/h0$c;->D:LF0/h0$c;

    invoke-static {}, LF0/h0$c;->e()[LF0/h0$c;

    move-result-object v0

    sput-object v0, LF0/h0$c;->E:[LF0/h0$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LF0/h0$c;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LF0/h0$c;

    sget-object v1, LF0/h0$c;->C:LF0/h0$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LF0/h0$c;->D:LF0/h0$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LF0/h0$c;
    .locals 1

    const-class v0, LF0/h0$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LF0/h0$c;

    return-object p0
.end method

.method public static values()[LF0/h0$c;
    .locals 1

    sget-object v0, LF0/h0$c;->E:[LF0/h0$c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LF0/h0$c;

    return-object v0
.end method
