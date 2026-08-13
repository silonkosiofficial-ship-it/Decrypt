.class public final Lx/C$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/C$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx/C;

.field final synthetic b:Lx/r;


# direct methods
.method constructor <init>(Lx/C;Lx/r;)V
    .locals 0

    iput-object p1, p0, Lx/C$b$a;->a:Lx/C;

    iput-object p2, p0, Lx/C$b$a;->b:Lx/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(F)F
    .locals 4

    iget-object v0, p0, Lx/C$b$a;->a:Lx/C;

    iget-object v1, p0, Lx/C$b$a;->b:Lx/r;

    invoke-virtual {v0, p1}, Lx/C;->B(F)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lx/C;->u(J)J

    move-result-wide v2

    sget-object p1, Ly0/f;->a:Ly0/f$a;

    invoke-virtual {p1}, Ly0/f$a;->a()I

    move-result p1

    invoke-interface {v1, v2, v3, p1}, Lx/r;->a(JI)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lx/C;->A(J)F

    move-result p1

    invoke-virtual {v0, p1}, Lx/C;->t(F)F

    move-result p1

    return p1
.end method
