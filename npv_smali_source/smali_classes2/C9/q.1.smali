.class public final synthetic LC9/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic C:LV/w0;

.field public final synthetic D:LV/q0;

.field public final synthetic E:LV/G1;

.field public final synthetic F:LV/G1;


# direct methods
.method public synthetic constructor <init>(LV/w0;LV/q0;LV/G1;LV/G1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC9/q;->C:LV/w0;

    iput-object p2, p0, LC9/q;->D:LV/q0;

    iput-object p3, p0, LC9/q;->E:LV/G1;

    iput-object p4, p0, LC9/q;->F:LV/G1;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LC9/q;->C:LV/w0;

    iget-object v1, p0, LC9/q;->D:LV/q0;

    iget-object v2, p0, LC9/q;->E:LV/G1;

    iget-object v3, p0, LC9/q;->F:LV/G1;

    invoke-static {v0, v1, v2, v3}, LC9/p$e;->a(LV/w0;LV/q0;LV/G1;LV/G1;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
