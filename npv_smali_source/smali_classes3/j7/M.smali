.class public final Lj7/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lz7/a;


# instance fields
.field private final C:Lx7/a;


# direct methods
.method public constructor <init>(Lx7/a;)V
    .locals 1

    const-string v0, "iteratorFactory"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj7/M;->C:Lx7/a;

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lj7/N;

    iget-object v1, p0, Lj7/M;->C:Lx7/a;

    invoke-interface {v1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Iterator;

    invoke-direct {v0, v1}, Lj7/N;-><init>(Ljava/util/Iterator;)V

    return-object v0
.end method
