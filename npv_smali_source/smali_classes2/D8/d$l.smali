.class final LD8/d$l;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/d;-><init>(LB8/m;Li8/c;Lk8/c;Lk8/a;LO7/a0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD8/d;


# direct methods
.method constructor <init>(LD8/d;)V
    .locals 0

    iput-object p1, p0, LD8/d$l;->D:LD8/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LO7/h0;
    .locals 1

    iget-object v0, p0, LD8/d$l;->D:LD8/d;

    invoke-static {v0}, LD8/d;->X0(LD8/d;)LO7/h0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LD8/d$l;->a()LO7/h0;

    move-result-object v0

    return-object v0
.end method
