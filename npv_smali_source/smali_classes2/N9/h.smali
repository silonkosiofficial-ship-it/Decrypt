.class public final LN9/h;
.super LH9/C;
.source "SourceFile"


# instance fields
.field private final D:Ljava/lang/String;

.field private final E:J

.field private final F:LX9/f;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLX9/f;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LH9/C;-><init>()V

    iput-object p1, p0, LN9/h;->D:Ljava/lang/String;

    iput-wide p2, p0, LN9/h;->E:J

    iput-object p4, p0, LN9/h;->F:LX9/f;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, LN9/h;->E:J

    return-wide v0
.end method

.method public f()LH9/w;
    .locals 2

    .prologue
    iget-object v0, p0, LN9/h;->D:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v1, LH9/w;->e:LH9/w$a;

    invoke-virtual {v1, v0}, LH9/w$a;->b(Ljava/lang/String;)LH9/w;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public g()LX9/f;
    .locals 1

    iget-object v0, p0, LN9/h;->F:LX9/f;

    return-object v0
.end method
