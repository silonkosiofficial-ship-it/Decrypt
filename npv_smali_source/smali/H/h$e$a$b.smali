.class final LH/h$e$a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/h$e$a;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LH/w;


# direct methods
.method constructor <init>(LH/w;)V
    .locals 0

    iput-object p1, p0, LH/h$e$a$b;->D:LH/w;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LH/V;
    .locals 1

    iget-object v0, p0, LH/h$e$a$b;->D:LH/w;

    invoke-virtual {v0}, LH/w;->j()LH/V;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LH/h$e$a$b;->a()LH/V;

    move-result-object v0

    return-object v0
.end method
