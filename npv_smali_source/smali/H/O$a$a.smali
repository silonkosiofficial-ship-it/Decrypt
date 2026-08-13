.class final LH/O$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/O$a;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/w0;

.field final synthetic E:Lz/l;


# direct methods
.method constructor <init>(LV/w0;Lz/l;)V
    .locals 0

    iput-object p1, p0, LH/O$a$a;->D:LV/w0;

    iput-object p2, p0, LH/O$a$a;->E:Lz/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/N;)LV/M;
    .locals 2

    iget-object p1, p0, LH/O$a$a;->D:LV/w0;

    iget-object v0, p0, LH/O$a$a;->E:Lz/l;

    new-instance v1, LH/O$a$a$a;

    invoke-direct {v1, p1, v0}, LH/O$a$a$a;-><init>(LV/w0;Lz/l;)V

    return-object v1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/N;

    invoke-virtual {p0, p1}, LH/O$a$a;->a(LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
