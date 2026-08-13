.class public final enum LJ7/a$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum C:LJ7/a$b;

.field public static final enum D:LJ7/a$b;

.field private static final synthetic E:[LJ7/a$b;

.field private static final synthetic F:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LJ7/a$b;

    const-string v1, "JAVA"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LJ7/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LJ7/a$b;->C:LJ7/a$b;

    new-instance v0, LJ7/a$b;

    const-string v1, "KOTLIN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LJ7/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LJ7/a$b;->D:LJ7/a$b;

    invoke-static {}, LJ7/a$b;->e()[LJ7/a$b;

    move-result-object v0

    sput-object v0, LJ7/a$b;->E:[LJ7/a$b;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, LJ7/a$b;->F:Lp7/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[LJ7/a$b;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LJ7/a$b;

    sget-object v1, LJ7/a$b;->C:LJ7/a$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LJ7/a$b;->D:LJ7/a$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LJ7/a$b;
    .locals 1

    const-class v0, LJ7/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LJ7/a$b;

    return-object p0
.end method

.method public static values()[LJ7/a$b;
    .locals 1

    sget-object v0, LJ7/a$b;->E:[LJ7/a$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LJ7/a$b;

    return-object v0
.end method
