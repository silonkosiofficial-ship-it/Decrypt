.class public final enum Lba/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lba/a$a;
    }
.end annotation


# static fields
.field public static final C:Lba/a$a;

.field public static final enum D:Lba/a;

.field public static final enum E:Lba/a;

.field public static final enum F:Lba/a;

.field public static final enum G:Lba/a;

.field public static final enum H:Lba/a;

.field public static final enum I:Lba/a;

.field private static final synthetic J:[Lba/a;

.field private static final synthetic K:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lba/a;

    const-string v1, "ZERO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lba/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lba/a;->D:Lba/a;

    new-instance v0, Lba/a;

    const-string v1, "ONE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lba/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lba/a;->E:Lba/a;

    new-instance v0, Lba/a;

    const-string v1, "TWO"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lba/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lba/a;->F:Lba/a;

    new-instance v0, Lba/a;

    const-string v1, "FEW"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lba/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lba/a;->G:Lba/a;

    new-instance v0, Lba/a;

    const-string v1, "MANY"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lba/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lba/a;->H:Lba/a;

    new-instance v0, Lba/a;

    const-string v1, "OTHER"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lba/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lba/a;->I:Lba/a;

    invoke-static {}, Lba/a;->e()[Lba/a;

    move-result-object v0

    sput-object v0, Lba/a;->J:[Lba/a;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lba/a;->K:Lp7/a;

    new-instance v0, Lba/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lba/a$a;-><init>(Ly7/k;)V

    sput-object v0, Lba/a;->C:Lba/a$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lba/a;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lba/a;

    sget-object v1, Lba/a;->D:Lba/a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lba/a;->E:Lba/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lba/a;->F:Lba/a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lba/a;->G:Lba/a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lba/a;->H:Lba/a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lba/a;->I:Lba/a;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static g()Lp7/a;
    .locals 1

    sget-object v0, Lba/a;->K:Lp7/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lba/a;
    .locals 1

    const-class v0, Lba/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lba/a;

    return-object p0
.end method

.method public static values()[Lba/a;
    .locals 1

    sget-object v0, Lba/a;->J:[Lba/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lba/a;

    return-object v0
.end method
