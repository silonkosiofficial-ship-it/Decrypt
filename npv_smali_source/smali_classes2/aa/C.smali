.class public final enum Laa/C;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Laa/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laa/C$a;
    }
.end annotation


# static fields
.field public static final C:Laa/C$a;

.field public static final enum D:Laa/C;

.field public static final enum E:Laa/C;

.field private static final synthetic F:[Laa/C;

.field private static final synthetic G:Lp7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Laa/C;

    const-string v1, "LIGHT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Laa/C;-><init>(Ljava/lang/String;I)V

    sput-object v0, Laa/C;->D:Laa/C;

    new-instance v0, Laa/C;

    const-string v1, "DARK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Laa/C;-><init>(Ljava/lang/String;I)V

    sput-object v0, Laa/C;->E:Laa/C;

    invoke-static {}, Laa/C;->e()[Laa/C;

    move-result-object v0

    sput-object v0, Laa/C;->F:[Laa/C;

    invoke-static {v0}, Lp7/b;->a([Ljava/lang/Enum;)Lp7/a;

    move-result-object v0

    sput-object v0, Laa/C;->G:Lp7/a;

    new-instance v0, Laa/C$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Laa/C$a;-><init>(Ly7/k;)V

    sput-object v0, Laa/C;->C:Laa/C$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic e()[Laa/C;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Laa/C;

    sget-object v1, Laa/C;->D:Laa/C;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Laa/C;->E:Laa/C;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Laa/C;
    .locals 1

    const-class v0, Laa/C;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Laa/C;

    return-object p0
.end method

.method public static values()[Laa/C;
    .locals 1

    sget-object v0, Laa/C;->F:[Laa/C;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Laa/C;

    return-object v0
.end method
