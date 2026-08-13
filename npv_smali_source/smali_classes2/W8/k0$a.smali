.class final LW8/k0$a;
.super LW8/k0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW8/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final E:LW8/l;

.field final synthetic F:LW8/k0;


# direct methods
.method public constructor <init>(LW8/k0;JLW8/l;)V
    .locals 0

    iput-object p1, p0, LW8/k0$a;->F:LW8/k0;

    invoke-direct {p0, p2, p3}, LW8/k0$c;-><init>(J)V

    iput-object p4, p0, LW8/k0$a;->E:LW8/l;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, LW8/k0$a;->E:LW8/l;

    iget-object v1, p0, LW8/k0$a;->F:LW8/k0;

    sget-object v2, Li7/M;->a:Li7/M;

    invoke-interface {v0, v1, v2}, LW8/l;->F(LW8/J;Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, LW8/k0$c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LW8/k0$a;->E:LW8/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
