.class public final enum Lr8/l$i$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr8/l$i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum C:Lr8/l$i$a;

.field public static final enum D:Lr8/l$i$a;

.field public static final enum E:Lr8/l$i$a;

.field private static final synthetic F:[Lr8/l$i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lr8/l$i$a;

    const-string v1, "OVERRIDABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr8/l$i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr8/l$i$a;->C:Lr8/l$i$a;

    new-instance v1, Lr8/l$i$a;

    const-string v3, "INCOMPATIBLE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lr8/l$i$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lr8/l$i$a;->D:Lr8/l$i$a;

    new-instance v3, Lr8/l$i$a;

    const-string v5, "CONFLICT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lr8/l$i$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lr8/l$i$a;->E:Lr8/l$i$a;

    const/4 v5, 0x3

    new-array v5, v5, [Lr8/l$i$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lr8/l$i$a;->F:[Lr8/l$i$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lr8/l$i$a;
    .locals 1

    const-class v0, Lr8/l$i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr8/l$i$a;

    return-object p0
.end method

.method public static values()[Lr8/l$i$a;
    .locals 1

    sget-object v0, Lr8/l$i$a;->F:[Lr8/l$i$a;

    invoke-virtual {v0}, [Lr8/l$i$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr8/l$i$a;

    return-object v0
.end method
