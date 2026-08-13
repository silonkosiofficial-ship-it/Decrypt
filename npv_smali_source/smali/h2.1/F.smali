.class public final Lh2/F;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/F$d;
    }
.end annotation


# static fields
.field public static final e:Lh2/F$d;

.field private static final f:Lh2/X;

.field private static final g:Lh2/o;


# instance fields
.field private final a:LZ8/f;

.field private final b:Lh2/X;

.field private final c:Lh2/o;

.field private final d:Lx7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh2/F$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh2/F$d;-><init>(Ly7/k;)V

    sput-object v0, Lh2/F;->e:Lh2/F$d;

    new-instance v0, Lh2/F$c;

    invoke-direct {v0}, Lh2/F$c;-><init>()V

    sput-object v0, Lh2/F;->f:Lh2/X;

    new-instance v0, Lh2/F$b;

    invoke-direct {v0}, Lh2/F$b;-><init>()V

    sput-object v0, Lh2/F;->g:Lh2/o;

    return-void
.end method

.method public constructor <init>(LZ8/f;Lh2/X;Lh2/o;Lx7/a;)V
    .locals 1

    const-string v0, "flow"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiReceiver"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hintReceiver"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cachedPageEvent"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/F;->a:LZ8/f;

    iput-object p2, p0, Lh2/F;->b:Lh2/X;

    iput-object p3, p0, Lh2/F;->c:Lh2/o;

    iput-object p4, p0, Lh2/F;->d:Lx7/a;

    return-void
.end method

.method public synthetic constructor <init>(LZ8/f;Lh2/X;Lh2/o;Lx7/a;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    sget-object p4, Lh2/F$a;->D:Lh2/F$a;

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lh2/F;-><init>(LZ8/f;Lh2/X;Lh2/o;Lx7/a;)V

    return-void
.end method


# virtual methods
.method public final a()Lh2/x$b;
    .locals 1

    iget-object v0, p0, Lh2/F;->d:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/x$b;

    return-object v0
.end method

.method public final b()LZ8/f;
    .locals 1

    iget-object v0, p0, Lh2/F;->a:LZ8/f;

    return-object v0
.end method

.method public final c()Lh2/o;
    .locals 1

    iget-object v0, p0, Lh2/F;->c:Lh2/o;

    return-object v0
.end method

.method public final d()Lh2/X;
    .locals 1

    iget-object v0, p0, Lh2/F;->b:Lh2/X;

    return-object v0
.end method
