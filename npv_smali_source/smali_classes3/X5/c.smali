.class public final LX5/c;
.super LX5/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX5/c$a;
    }
.end annotation


# static fields
.field public static final c:LX5/c$a;


# instance fields
.field private final a:LE7/i;

.field private final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LX5/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX5/c$a;-><init>(Ly7/k;)V

    sput-object v0, LX5/c;->c:LX5/c$a;

    return-void
.end method

.method private constructor <init>(LE7/i;Z)V
    .locals 0

    invoke-direct {p0}, LX5/a;-><init>()V

    iput-object p1, p0, LX5/c;->a:LE7/i;

    iput-boolean p2, p0, LX5/c;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(LE7/i;ZLy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LX5/c;-><init>(LE7/i;Z)V

    return-void
.end method


# virtual methods
.method public d(ILjava/lang/StringBuilder;)Z
    .locals 2

    .prologue
    const-string v0, "stringBuilder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LX5/c;->b:Z

    iget-object v1, p0, LX5/c;->a:LE7/i;

    invoke-virtual {v1, p1}, LE7/i;->D(I)Z

    move-result v1

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const-string v0, "&#"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-static {v0}, LS8/a;->a(I)I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x3b

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 p1, 0x1

    return p1
.end method
