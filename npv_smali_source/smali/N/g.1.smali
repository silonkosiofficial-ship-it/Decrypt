.class public final LN/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/window/r;


# instance fields
.field private final a:Lh0/c;

.field private final b:LN/i;

.field private c:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lh0/c;LN/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN/g;->a:Lh0/c;

    iput-object p2, p0, LN/g;->b:LN/i;

    sget-object p1, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p1}, Ln0/g$a;->c()J

    move-result-wide p1

    iput-wide p1, p0, LN/g;->c:J

    return-void
.end method


# virtual methods
.method public a(LY0/r;JLY0/v;J)J
    .locals 6

    .prologue
    iget-object p2, p0, LN/g;->b:LN/i;

    invoke-interface {p2}, LN/i;->a()J

    move-result-wide p2

    invoke-static {p2, p3}, Ln0/h;->c(J)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-wide p2, p0, LN/g;->c:J

    :goto_0
    iput-wide p2, p0, LN/g;->c:J

    iget-object v0, p0, LN/g;->a:Lh0/c;

    sget-object v1, LY0/t;->b:LY0/t$a;

    invoke-virtual {v1}, LY0/t$a;->a()J

    move-result-wide v3

    move-wide v1, p5

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, Lh0/c;->a(JJLY0/v;)J

    move-result-wide p4

    invoke-virtual {p1}, LY0/r;->j()J

    move-result-wide v0

    invoke-static {p2, p3}, LY0/q;->d(J)J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, LY0/p;->l(JJ)J

    move-result-wide p1

    invoke-static {p1, p2, p4, p5}, LY0/p;->l(JJ)J

    move-result-wide p1

    return-wide p1
.end method
