.class final LD8/d$a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/d$a;-><init>(LD8/d;LG8/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD8/d$a;


# direct methods
.method constructor <init>(LD8/d$a;)V
    .locals 0

    iput-object p1, p0, LD8/d$a$b;->D:LD8/d$a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 4

    iget-object v0, p0, LD8/d$a$b;->D:LD8/d$a;

    sget-object v1, Ly8/d;->o:Ly8/d;

    sget-object v2, Ly8/h;->a:Ly8/h$a;

    invoke-virtual {v2}, Ly8/h$a;->a()Lx7/l;

    move-result-object v2

    sget-object v3, LW7/d;->O:LW7/d;

    invoke-virtual {v0, v1, v2, v3}, LD8/h;->j(Ly8/d;Lx7/l;LW7/b;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LD8/d$a$b;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
