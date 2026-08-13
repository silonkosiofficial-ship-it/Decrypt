.class public final synthetic LG6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:Ly7/M;

.field public final synthetic D:LX9/f;

.field public final synthetic E:LO6/e;

.field public final synthetic F:Lm7/i;


# direct methods
.method public synthetic constructor <init>(Ly7/M;LX9/f;LO6/e;Lm7/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG6/m;->C:Ly7/M;

    iput-object p2, p0, LG6/m;->D:LX9/f;

    iput-object p3, p0, LG6/m;->E:LO6/e;

    iput-object p4, p0, LG6/m;->F:Lm7/i;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LG6/m;->C:Ly7/M;

    iget-object v1, p0, LG6/m;->D:LX9/f;

    iget-object v2, p0, LG6/m;->E:LO6/e;

    iget-object v3, p0, LG6/m;->F:Lm7/i;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-static {v0, v1, v2, v3, p1}, LG6/l$b;->H(Ly7/M;LX9/f;LO6/e;Lm7/i;Ljava/nio/ByteBuffer;)Li7/M;

    move-result-object p1

    return-object p1
.end method
