.class public final synthetic Lk5/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lk5/w;

.field public final synthetic D:J

.field public final synthetic E:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lk5/w;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/u;->C:Lk5/w;

    iput-wide p2, p0, Lk5/u;->D:J

    iput-object p4, p0, Lk5/u;->E:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lk5/u;->C:Lk5/w;

    iget-wide v1, p0, Lk5/u;->D:J

    iget-object v3, p0, Lk5/u;->E:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lk5/w;->a(Lk5/w;JLjava/lang/String;)V

    return-void
.end method
