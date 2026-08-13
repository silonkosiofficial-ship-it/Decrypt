.class public abstract Lr/O;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr/H;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr/H;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr/H;-><init>(I)V

    sput-object v0, Lr/O;->a:Lr/H;

    return-void
.end method

.method public static final a()Lr/N;
    .locals 2

    sget-object v0, Lr/O;->a:Lr/H;

    const-string v1, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final b()Lr/H;
    .locals 4

    new-instance v0, Lr/H;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lr/H;-><init>(IILy7/k;)V

    return-object v0
.end method
