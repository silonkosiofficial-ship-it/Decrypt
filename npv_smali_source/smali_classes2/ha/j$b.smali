.class final enum Lha/j$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lha/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation


# static fields
.field public static final enum C:Lha/j$b;

.field public static final enum D:Lha/j$b;

.field private static final synthetic E:[Lha/j$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lha/j$b;

    const-string v1, "Stderr"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lha/j$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lha/j$b;->C:Lha/j$b;

    new-instance v0, Lha/j$b;

    const-string v1, "Stdout"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lha/j$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lha/j$b;->D:Lha/j$b;

    invoke-static {}, Lha/j$b;->e()[Lha/j$b;

    move-result-object v0

    sput-object v0, Lha/j$b;->E:[Lha/j$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic e()[Lha/j$b;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lha/j$b;

    sget-object v1, Lha/j$b;->C:Lha/j$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lha/j$b;->D:Lha/j$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lha/j$b;
    .locals 1

    const-class v0, Lha/j$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lha/j$b;

    return-object p0
.end method

.method public static values()[Lha/j$b;
    .locals 1

    sget-object v0, Lha/j$b;->E:[Lha/j$b;

    invoke-virtual {v0}, [Lha/j$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lha/j$b;

    return-object v0
.end method
