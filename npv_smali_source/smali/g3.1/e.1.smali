.class abstract Lg3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg3/e$a;
    }
.end annotation


# static fields
.field static final a:Lg3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lg3/e;->a()Lg3/e$a;

    move-result-object v0

    const-wide/32 v1, 0xa00000

    invoke-virtual {v0, v1, v2}, Lg3/e$a;->f(J)Lg3/e$a;

    move-result-object v0

    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Lg3/e$a;->d(I)Lg3/e$a;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Lg3/e$a;->b(I)Lg3/e$a;

    move-result-object v0

    const-wide/32 v1, 0x240c8400

    invoke-virtual {v0, v1, v2}, Lg3/e$a;->c(J)Lg3/e$a;

    move-result-object v0

    const v1, 0x14000

    invoke-virtual {v0, v1}, Lg3/e$a;->e(I)Lg3/e$a;

    move-result-object v0

    invoke-virtual {v0}, Lg3/e$a;->a()Lg3/e;

    move-result-object v0

    sput-object v0, Lg3/e;->a:Lg3/e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a()Lg3/e$a;
    .locals 1

    new-instance v0, Lg3/a$b;

    invoke-direct {v0}, Lg3/a$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method abstract b()I
.end method

.method abstract c()J
.end method

.method abstract d()I
.end method

.method abstract e()I
.end method

.method abstract f()J
.end method
