.class public final enum Lj1/g$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation


# static fields
.field public static final enum C:Lj1/g$d;

.field public static final enum D:Lj1/g$d;

.field public static final enum E:Lj1/g$d;

.field public static final enum F:Lj1/g$d;

.field public static final enum G:Lj1/g$d;

.field public static final enum H:Lj1/g$d;

.field private static final synthetic I:[Lj1/g$d;

.field private static final synthetic J:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lj1/g$d;

    const-string v1, "LEFT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj1/g$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj1/g$d;->C:Lj1/g$d;

    new-instance v0, Lj1/g$d;

    const-string v1, "RIGHT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lj1/g$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj1/g$d;->D:Lj1/g$d;

    new-instance v0, Lj1/g$d;

    const-string v1, "START"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lj1/g$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj1/g$d;->E:Lj1/g$d;

    new-instance v0, Lj1/g$d;

    const-string v1, "END"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lj1/g$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj1/g$d;->F:Lj1/g$d;

    new-instance v0, Lj1/g$d;

    const-string v1, "TOP"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lj1/g$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj1/g$d;->G:Lj1/g$d;

    new-instance v0, Lj1/g$d;

    const-string v1, "BOTTOM"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lj1/g$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj1/g$d;->H:Lj1/g$d;

    invoke-static {}, Lj1/g$d;->e()[Lj1/g$d;

    move-result-object v0

    sput-object v0, Lj1/g$d;->I:[Lj1/g$d;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Lj1/g$d;->J:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lj1/g$d;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lj1/g$d;

    sget-object v1, Lj1/g$d;->C:Lj1/g$d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lj1/g$d;->D:Lj1/g$d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lj1/g$d;->E:Lj1/g$d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lj1/g$d;->F:Lj1/g$d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lj1/g$d;->G:Lj1/g$d;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lj1/g$d;->H:Lj1/g$d;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lj1/g$d;
    .locals 1

    const-class v0, Lj1/g$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj1/g$d;

    return-object p0
.end method

.method public static values()[Lj1/g$d;
    .locals 1

    sget-object v0, Lj1/g$d;->I:[Lj1/g$d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj1/g$d;

    return-object v0
.end method
