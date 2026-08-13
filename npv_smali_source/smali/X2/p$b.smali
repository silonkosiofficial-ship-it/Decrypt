.class public final enum LX2/p$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum D:LX2/p$b;

.field public static final enum E:LX2/p$b;

.field private static final F:Landroid/util/SparseArray;

.field private static final synthetic G:[LX2/p$b;


# instance fields
.field private final C:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LX2/p$b;

    const-string v1, "NOT_SET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LX2/p$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LX2/p$b;->D:LX2/p$b;

    new-instance v1, LX2/p$b;

    const-string v3, "EVENT_OVERRIDE"

    const/4 v4, 0x1

    const/4 v5, 0x5

    invoke-direct {v1, v3, v4, v5}, LX2/p$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, LX2/p$b;->E:LX2/p$b;

    const/4 v3, 0x2

    new-array v3, v3, [LX2/p$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, LX2/p$b;->G:[LX2/p$b;

    new-instance v3, Landroid/util/SparseArray;

    invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V

    sput-object v3, LX2/p$b;->F:Landroid/util/SparseArray;

    invoke-virtual {v3, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {v3, v5, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LX2/p$b;->C:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LX2/p$b;
    .locals 1

    const-class v0, LX2/p$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LX2/p$b;

    return-object p0
.end method

.method public static values()[LX2/p$b;
    .locals 1

    sget-object v0, LX2/p$b;->G:[LX2/p$b;

    invoke-virtual {v0}, [LX2/p$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LX2/p$b;

    return-object v0
.end method
