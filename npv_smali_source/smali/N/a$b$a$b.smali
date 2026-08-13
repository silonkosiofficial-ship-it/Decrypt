.class final LN/a$b$a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/a$b$a;->a(LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN/i;


# direct methods
.method constructor <init>(LN/i;)V
    .locals 0

    iput-object p1, p0, LN/a$b$a$b;->D:LN/i;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, LN/a$b$a$b;->D:LN/i;

    invoke-interface {v0}, LN/i;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/h;->c(J)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/a$b$a$b;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
