.class public final LK0/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lx7/p;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lx7/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK0/v;->a:Ljava/lang/String;

    iput-object p2, p0, LK0/v;->b:Lx7/p;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lx7/p;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, LK0/v$a;->D:LK0/v$a;

    :cond_0
    invoke-direct {p0, p1, p2}, LK0/v;-><init>(Ljava/lang/String;Lx7/p;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, LK0/v;-><init>(Ljava/lang/String;Lx7/p;ILy7/k;)V

    iput-boolean p2, p0, LK0/v;->c:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLx7/p;)V
    .locals 0

    invoke-direct {p0, p1, p3}, LK0/v;-><init>(Ljava/lang/String;Lx7/p;)V

    iput-boolean p2, p0, LK0/v;->c:Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LK0/v;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, LK0/v;->c:Z

    return v0
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LK0/v;->b:Lx7/p;

    invoke-interface {v0, p1, p2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d(LK0/w;LF7/k;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p1, p0, p3}, LK0/w;->d(LK0/v;Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AccessibilityKey: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LK0/v;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
