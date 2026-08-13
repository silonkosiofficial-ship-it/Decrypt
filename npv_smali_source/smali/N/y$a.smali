.class final LN/y$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LN/y$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/y$a;

    invoke-direct {v0}, LN/y$a;-><init>()V

    sput-object v0, LN/y$a;->D:LN/y$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)Lu/o;
    .locals 2

    .prologue
    invoke-static {p1, p2}, Ln0/h;->c(J)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lu/o;

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v1

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result p1

    invoke-direct {v0, v1, p1}, Lu/o;-><init>(FF)V

    goto :goto_0

    :cond_0
    invoke-static {}, LN/y;->a()Lu/o;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ln0/g;

    invoke-virtual {p1}, Ln0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LN/y$a;->a(J)Lu/o;

    move-result-object p1

    return-object p1
.end method
