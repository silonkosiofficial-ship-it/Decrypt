.class public abstract Lr/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[Ljava/lang/Object;

.field private static final b:Lr/P;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    sput-object v1, Lr/Q;->a:[Ljava/lang/Object;

    new-instance v1, Lr/I;

    invoke-direct {v1, v0}, Lr/I;-><init>(I)V

    sput-object v1, Lr/Q;->b:Lr/P;

    return-void
.end method

.method public static final synthetic a()[Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr/Q;->a:[Ljava/lang/Object;

    return-object v0
.end method

.method public static final b(Ljava/lang/Object;)Lr/I;
    .locals 2

    new-instance v0, Lr/I;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lr/I;-><init>(I)V

    invoke-virtual {v0, p0}, Lr/I;->g(Ljava/lang/Object;)Z

    return-object v0
.end method
