.class public final synthetic LF6/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:LT6/p;

.field public final synthetic D:LU6/b;


# direct methods
.method public synthetic constructor <init>(LT6/p;LU6/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF6/p;->C:LT6/p;

    iput-object p2, p0, LF6/p;->D:LU6/b;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LF6/p;->C:LT6/p;

    iget-object v1, p0, LF6/p;->D:LU6/b;

    check-cast p1, LT6/q;

    invoke-static {v0, v1, p1}, LF6/t;->b(LT6/p;LU6/b;LT6/q;)Li7/M;

    move-result-object p1

    return-object p1
.end method
