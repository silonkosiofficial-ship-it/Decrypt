.class public final enum Lf2/c$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation


# static fields
.field public static final enum C:Lf2/c$e;

.field public static final enum D:Lf2/c$e;

.field public static final enum E:Lf2/c$e;

.field private static final synthetic F:[Lf2/c$e;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lf2/c$e;

    const-string v1, "PENDING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf2/c$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/c$e;->C:Lf2/c$e;

    new-instance v1, Lf2/c$e;

    const-string v3, "RUNNING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lf2/c$e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lf2/c$e;->D:Lf2/c$e;

    new-instance v3, Lf2/c$e;

    const-string v5, "FINISHED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lf2/c$e;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lf2/c$e;->E:Lf2/c$e;

    const/4 v5, 0x3

    new-array v5, v5, [Lf2/c$e;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lf2/c$e;->F:[Lf2/c$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lf2/c$e;
    .locals 1

    const-class v0, Lf2/c$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf2/c$e;

    return-object p0
.end method

.method public static values()[Lf2/c$e;
    .locals 1

    sget-object v0, Lf2/c$e;->F:[Lf2/c$e;

    invoke-virtual {v0}, [Lf2/c$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf2/c$e;

    return-object v0
.end method
