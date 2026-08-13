.class public final synthetic La4/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:La4/l;

.field public final synthetic D:Ll4/m;


# direct methods
.method public synthetic constructor <init>(La4/l;Ll4/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/h;->C:La4/l;

    iput-object p2, p0, La4/h;->D:Ll4/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, La4/h;->C:La4/l;

    iget-object v1, p0, La4/h;->D:Ll4/m;

    invoke-virtual {v0, v1}, La4/l;->e(Ll4/m;)V

    return-void
.end method
