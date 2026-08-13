.class final LT/A$r$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/A$r;->a(Ll0/d;)Ll0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lo0/L1;

.field final synthetic E:Lo0/B0;


# direct methods
.method constructor <init>(Lo0/L1;Lo0/B0;)V
    .locals 0

    iput-object p1, p0, LT/A$r$a;->D:Lo0/L1;

    iput-object p2, p0, LT/A$r$a;->E:Lo0/B0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/g;)V
    .locals 10

    iget-object v1, p0, LT/A$r$a;->D:Lo0/L1;

    iget-object v0, p0, LT/A$r$a;->E:Lo0/B0;

    invoke-interface {v0}, Lo0/B0;->a()J

    move-result-wide v2

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v9}, Lo0/M1;->d(Lq0/g;Lo0/L1;JFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/g;

    invoke-virtual {p0, p1}, LT/A$r$a;->a(Lq0/g;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
