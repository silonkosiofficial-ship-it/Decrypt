.class final LM9/f$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM9/f;->i(LM9/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LH9/g;

.field final synthetic E:LH9/s;

.field final synthetic F:LH9/a;


# direct methods
.method constructor <init>(LH9/g;LH9/s;LH9/a;)V
    .locals 0

    iput-object p1, p0, LM9/f$c;->D:LH9/g;

    iput-object p2, p0, LM9/f$c;->E:LH9/s;

    iput-object p3, p0, LM9/f$c;->F:LH9/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 3

    iget-object v0, p0, LM9/f$c;->D:LH9/g;

    invoke-virtual {v0}, LH9/g;->d()LU9/c;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, LM9/f$c;->E:LH9/s;

    invoke-virtual {v1}, LH9/s;->d()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, LM9/f$c;->F:LH9/a;

    invoke-virtual {v2}, LH9/a;->l()LH9/u;

    move-result-object v2

    invoke-virtual {v2}, LH9/u;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LU9/c;->a(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LM9/f$c;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
