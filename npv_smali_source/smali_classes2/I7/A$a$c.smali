.class final LI7/A$a$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/A$a;->e()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/A;


# direct methods
.method constructor <init>(LI7/A;)V
    .locals 0

    iput-object p1, p0, LI7/A$a$c;->D:LI7/A;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LI7/A$a$c;->D:LI7/A;

    invoke-virtual {v0}, LI7/A;->c()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0}, LU7/d;->d(Ljava/lang/reflect/Type;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/A$a$c;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
