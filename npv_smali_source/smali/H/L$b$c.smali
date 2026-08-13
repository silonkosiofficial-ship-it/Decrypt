.class final LH/L$b$c;
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
.field public static final D:LH/L$b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH/L$b$c;

    invoke-direct {v0}, LH/L$b$c;-><init>()V

    sput-object v0, LH/L$b$c;->D:LH/L$b$c;

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
    .locals 3

    new-instance v0, LS0/g;

    invoke-virtual {p1}, LN/b;->u()J

    move-result-wide v1

    invoke-static {v1, v2}, LM0/N;->i(J)I

    move-result v1

    invoke-virtual {p1}, LN/b;->q()I

    move-result p1

    sub-int/2addr v1, p1

    const/4 p1, 0x0

    invoke-direct {v0, v1, p1}, LS0/g;-><init>(II)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN/E;

    invoke-virtual {p0, p1}, LH/L$b$c;->a(LN/E;)LS0/i;

    move-result-object p1

    return-object p1
.end method
