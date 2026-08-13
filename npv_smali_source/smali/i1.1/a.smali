.class public final Li1/a;
.super Li1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li1/a$a;
    }
.end annotation


# static fields
.field public static final N:Li1/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li1/a$a;-><init>(Ly7/k;)V

    sput-object v0, Li1/a;->N:Li1/a$a;

    return-void
.end method

.method public constructor <init>(Li1/a;)V
    .locals 1

    const-string v0, "clArray"

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

    invoke-virtual {p0}, Li1/a;->n0()Li1/b;

    move-result-object v0

    return-object v0
.end method

.method public n0()Li1/b;
    .locals 1

    new-instance v0, Li1/a;

    invoke-direct {v0, p0}, Li1/a;-><init>(Li1/a;)V

    return-object v0
.end method
