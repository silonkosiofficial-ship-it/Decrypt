.class public final LL9/c;
.super LL9/a;
.source "SourceFile"


# instance fields
.field final synthetic e:Lx7/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLx7/a;)V
    .locals 0

    iput-object p3, p0, LL9/c;->e:Lx7/a;

    invoke-direct {p0, p1, p2}, LL9/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 2

    iget-object v0, p0, LL9/c;->e:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    const-wide/16 v0, -0x1

    return-wide v0
.end method
