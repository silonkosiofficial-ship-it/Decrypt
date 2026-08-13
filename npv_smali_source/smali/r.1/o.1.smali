.class public abstract Lr/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr/C;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr/C;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr/C;-><init>(I)V

    sput-object v0, Lr/o;->a:Lr/C;

    return-void
.end method

.method public static final a()Lr/n;
    .locals 2

    sget-object v0, Lr/o;->a:Lr/C;

    const-string v1, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final b()Lr/C;
    .locals 4

    new-instance v0, Lr/C;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lr/C;-><init>(IILy7/k;)V

    return-object v0
.end method

.method public static final c(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Lr/C;
    .locals 4

    new-instance v0, Lr/C;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lr/C;-><init>(IILy7/k;)V

    invoke-virtual {v0, p0, p1}, Lr/C;->s(ILjava/lang/Object;)V

    invoke-virtual {v0, p2, p3}, Lr/C;->s(ILjava/lang/Object;)V

    invoke-virtual {v0, p4, p5}, Lr/C;->s(ILjava/lang/Object;)V

    return-object v0
.end method
