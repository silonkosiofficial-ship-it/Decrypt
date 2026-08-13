.class public final synthetic Lk5/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lk5/Z;

.field public final synthetic D:Ln5/F$e$d;

.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Z


# direct methods
.method public synthetic constructor <init>(Lk5/Z;Ln5/F$e$d;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/Y;->C:Lk5/Z;

    iput-object p2, p0, Lk5/Y;->D:Ln5/F$e$d;

    iput-object p3, p0, Lk5/Y;->E:Ljava/lang/String;

    iput-boolean p4, p0, Lk5/Y;->F:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lk5/Y;->C:Lk5/Z;

    iget-object v1, p0, Lk5/Y;->D:Ln5/F$e$d;

    iget-object v2, p0, Lk5/Y;->E:Ljava/lang/String;

    iget-boolean v3, p0, Lk5/Y;->F:Z

    invoke-static {v0, v1, v2, v3}, Lk5/Z;->a(Lk5/Z;Ln5/F$e$d;Ljava/lang/String;Z)V

    return-void
.end method
