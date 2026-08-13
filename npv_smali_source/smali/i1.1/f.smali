.class public final Li1/f;
.super Li1/b;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lz7/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li1/f$a;,
        Li1/f$b;
    }
.end annotation


# static fields
.field public static final N:Li1/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li1/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li1/f$b;-><init>(Ly7/k;)V

    sput-object v0, Li1/f;->N:Li1/f$b;

    return-void
.end method

.method public constructor <init>(Li1/f;)V
    .locals 1

    const-string v0, "clObject"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Li1/b;-><init>(Li1/b;)V

    return-void
.end method

.method public constructor <init>([C)V
    .locals 1

    const-string v0, "content"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Li1/b;-><init>([C)V

    return-void
.end method


# virtual methods
.method public bridge synthetic d()Li1/c;
    .locals 1

    invoke-virtual {p0}, Li1/f;->n0()Li1/f;

    move-result-object v0

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Li1/f$a;

    invoke-direct {v0, p0}, Li1/f$a;-><init>(Li1/f;)V

    return-object v0
.end method

.method public n0()Li1/f;
    .locals 1

    new-instance v0, Li1/f;

    invoke-direct {v0, p0}, Li1/f;-><init>(Li1/f;)V

    return-object v0
.end method
