.class final enum Lt8/n$a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt8/n$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field public static final enum C:Lt8/n$a$a;

.field public static final enum D:Lt8/n$a$a;

.field private static final synthetic E:[Lt8/n$a$a;

.field private static final synthetic F:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lt8/n$a$a;

    const-string v1, "COMMON_SUPER_TYPE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lt8/n$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lt8/n$a$a;->C:Lt8/n$a$a;

    new-instance v0, Lt8/n$a$a;

    const-string v1, "INTERSECTION_TYPE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lt8/n$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lt8/n$a$a;->D:Lt8/n$a$a;

    invoke-static {}, Lt8/n$a$a;->e()[Lt8/n$a$a;

    move-result-object v0

    sput-object v0, Lt8/n$a$a;->E:[Lt8/n$a$a;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lt8/n$a$a;->F:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lt8/n$a$a;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lt8/n$a$a;

    sget-object v1, Lt8/n$a$a;->C:Lt8/n$a$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lt8/n$a$a;->D:Lt8/n$a$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lt8/n$a$a;
    .locals 1

    const-class v0, Lt8/n$a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lt8/n$a$a;

    return-object p0
.end method

.method public static values()[Lt8/n$a$a;
    .locals 1

    sget-object v0, Lt8/n$a$a;->E:[Lt8/n$a$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt8/n$a$a;

    return-object v0
.end method
