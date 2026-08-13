.class public final enum Lo0/Q1$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo0/Q1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum C:Lo0/Q1$b;

.field public static final enum D:Lo0/Q1$b;

.field private static final synthetic E:[Lo0/Q1$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo0/Q1$b;

    const-string v1, "CounterClockwise"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo0/Q1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo0/Q1$b;->C:Lo0/Q1$b;

    new-instance v0, Lo0/Q1$b;

    const-string v1, "Clockwise"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo0/Q1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo0/Q1$b;->D:Lo0/Q1$b;

    invoke-static {}, Lo0/Q1$b;->e()[Lo0/Q1$b;

    move-result-object v0

    sput-object v0, Lo0/Q1$b;->E:[Lo0/Q1$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Lo0/Q1$b;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lo0/Q1$b;

    sget-object v1, Lo0/Q1$b;->C:Lo0/Q1$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo0/Q1$b;->D:Lo0/Q1$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo0/Q1$b;
    .locals 1

    const-class v0, Lo0/Q1$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo0/Q1$b;

    return-object p0
.end method

.method public static values()[Lo0/Q1$b;
    .locals 1

    sget-object v0, Lo0/Q1$b;->E:[Lo0/Q1$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo0/Q1$b;

    return-object v0
.end method
