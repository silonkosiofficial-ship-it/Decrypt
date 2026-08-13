.class final LH/L$b$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/L$b;->a(LN/E;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LH/L$b$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH/L$b$e;

    invoke-direct {v0}, LH/L$b$e;-><init>()V

    sput-object v0, LH/L$b$e;->D:LH/L$b$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LN/E;)LS0/i;
    .locals 4

    .prologue
    invoke-virtual {p1}, LN/b;->t()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v1, LS0/g;

    invoke-virtual {p1}, LN/b;->u()J

    move-result-wide v2

    invoke-static {v2, v3}, LM0/N;->i(J)I

    move-result p1

    sub-int/2addr p1, v0

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, LS0/g;-><init>(II)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN/E;

    invoke-virtual {p0, p1}, LH/L$b$e;->a(LN/E;)LS0/i;

    move-result-object p1

    return-object p1
.end method
